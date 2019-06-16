package com.github.hcsp.objectbasic;

import com.github.hcsp.test.helper.JavaASTReader;
import com.github.hcsp.test.helper.ProjectSourceFileReader;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.expr.ClassExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void oomTest() {
        try {
            Main.main(null);
        } catch (OutOfMemoryError e) {
            Assertions.assertTrue(e.getMessage().contains("heap space"));
            return;
        }
        Assertions.assertTrue(false);
    }

    @Test
    public void noExplicitOOM() {
        // throw new OutOfMemoryError("heap space");
        Assertions.assertTrue(
                JavaASTReader.findAll(Main.class, ObjectCreationExpr.class).stream()
                        .map(ObjectCreationExpr::getType)
                        .noneMatch(this::isOOME));

        // throw OutOfMemoryError.class.getConstructor(String.class).newInstance("heap space");
        Assertions.assertTrue(
                JavaASTReader.findAll(Main.class, ClassExpr.class).stream()
                        .noneMatch(expr -> expr.getType().asString().contains("OutOfMemoryError")));

        // private static class MyError extends OutOfMemoryError
        Assertions.assertTrue(
                JavaASTReader.findAll(Main.class, ClassOrInterfaceDeclaration.class).stream()
                        .noneMatch(this::extendsOOME));

        // No reflections
        Assertions.assertFalse(
                ProjectSourceFileReader.readAsString(Main.class).contains("java.lang.reflect"));
    }

    private boolean extendsOOME(ClassOrInterfaceDeclaration type) {
        return type.getExtendedTypes().stream().anyMatch(this::isOOME);
    }

    private boolean isOOME(ClassOrInterfaceType type) {
        return "OutOfMemoryError".equals(type.getNameAsString());
    }
}

package org.mybatis.generator;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.Properties;
import java.util.Set;

/**
 * 描述：
 *
 * @version 1.9.10
 * @作者：niexiaohui
 * @创建时间：2016年11月22日
 * @修改记录：
 * @since 1.9.10
 */
public class MyCommentGenerator implements CommentGenerator {
    /**
     * Adds properties for this instance from any properties configured in the
     * CommentGenerator configuration.
     *
     * <p>This method will be called before any of the other methods.
     *
     * @param properties All properties from the configuration
     */
    public void addConfigurationProperties(Properties properties) {

    }

    /**
     * This method should add a Javadoc comment to the specified field. The field is related to the
     * specified table and is used to hold the value of the specified column.
     *
     * <p><b>Important:</b> This method should add a the nonstandard JavaDoc tag "@mbg.generated" to
     * the comment. Without this tag, the Eclipse based Java merge feature will fail.
     *
     * @param field              the field
     * @param introspectedTable  the introspected table
     * @param introspectedColumn
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
    }

    /**
     * Adds the field comment.
     *
     * @param field             the field
     * @param introspectedTable
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {

    }

    /**
     * Adds a comment for a model class.  The Java code merger should
     * be notified not to delete the entire class in case any manual
     * changes have been made.  So this method will always use the
     * "do not delete" annotation.
     *
     * <p>Because of difficulties with the Java file merger, the default implementation
     * of this method should NOT add comments.  Comments should only be added if
     * specifically requested by the user (for example, by enabling table remark comments).
     *
     * @param topLevelClass     the top level class
     * @param introspectedTable
     */
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        StringBuilder sb = new StringBuilder();
        topLevelClass.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        topLevelClass.addJavaDocLine(sb.toString().replace("\n", " "));
        topLevelClass.addJavaDocLine(" * @author " + System.getProperty("user.name"));
        topLevelClass.addJavaDocLine(" */");
    }

    /**
     * Adds the inner class comment.
     *
     * @param innerClass        the inner class
     * @param introspectedTable
     */
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {

    }

    /**
     * Adds the inner class comment.
     *
     * @param innerClass        the inner class
     * @param introspectedTable the introspected table
     * @param markAsDoNotDelete
     */
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {

    }

    /**
     * Adds the enum comment.
     *
     * @param innerEnum         the inner enum
     * @param introspectedTable
     */
    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {

    }

    /**
     * Adds the getter comment.
     *
     * @param method             the method
     * @param introspectedTable  the introspected table
     * @param introspectedColumn
     */
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    /**
     * Adds the setter comment.
     *
     * @param method             the method
     * @param introspectedTable  the introspected table
     * @param introspectedColumn
     */
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {


    }

    /**
     * Adds the general method comment.
     *
     * @param method            the method
     * @param introspectedTable
     */
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
//        StringBuilder sb = new StringBuilder();
//        method.addJavaDocLine("/**");
//        sb.append(" * ");
//        sb.append(introspectedTable.getRemarks());
//        method.addJavaDocLine(sb.toString().replace("\n", " "));
//        method.addJavaDocLine(" */");
    }

    /**
     * This method is called to add a file level comment to a generated java file. This method
     * could be used to add a general file comment (such as a copyright notice). However, note
     * that the Java file merge function in Eclipse does not deal with this comment. If you run
     * the generator repeatedly, you will only retain the comment from the initial run.
     *
     * <p>The default implementation does nothing.
     *
     * @param compilationUnit the compilation unit
     */
    public void addJavaFileComment(CompilationUnit compilationUnit) {

    }

    /**
     * This method should add a suitable comment as a child element of the specified xmlElement to warn users that the
     * element was generated and is subject to regeneration.
     *
     * @param xmlElement the xml element
     */
    public void addComment(XmlElement xmlElement) {

    }

    /**
     * This method is called to add a comment as the first child of the root element. This method
     * could be used to add a general file comment (such as a copyright notice). However, note
     * that the XML file merge function does not deal with this comment. If you run the generator
     * repeatedly, you will only retain the comment from the initial run.
     *
     * <p>The default implementation does nothing.
     *
     * @param rootElement the root element
     */
    public void addRootComment(XmlElement rootElement) {

    }

    /**
     * Adds a @Generated annotation to a method.
     *
     * @param method            the method
     * @param introspectedTable the introspected table
     * @param imports           the comment generator may add a required imported type to this list
     * @since 1.3.6
     */
    public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {

    }

    /**
     * Adds a @Generated annotation to a method.
     *
     * @param method             the method
     * @param introspectedTable  the introspected table
     * @param introspectedColumn thr introspected column
     * @param imports            the comment generator may add a required imported type to this list
     * @since 1.3.6
     */
    public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> imports) {

    }

    /**
     * Adds a @Generated annotation to a field.
     *
     * @param field             the field
     * @param introspectedTable the introspected table
     * @param imports           the comment generator may add a required imported type to this list
     * @since 1.3.6
     */
    public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {

    }

    /**
     * Adds a @Generated annotation to a field.
     *
     * @param field              the field
     * @param introspectedTable  the introspected table
     * @param introspectedColumn the introspected column
     * @param imports            the comment generator may add a required imported type to this list
     * @since 1.3.6
     */
    public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> imports) {

    }

    /**
     * Adds a @Generated annotation to a class.
     *
     * @param innerClass        the class
     * @param introspectedTable the introspected table
     * @param imports           the comment generator may add a required imported type to this list
     * @since 1.3.6
     */
    public void addClassAnnotation(InnerClass innerClass, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {

    }
}
package LinkToSQL;

import java.io.File;

/**
 * Created by FY on 17/3/30.
 */
public class ModelOfStudent {

    private int id;
    private String stuName;
    private int age;
    private String sex;
    private String gradeName;
    private File context;
    private File picture;

    public File getPicture() {
        return picture;
    }

    public void setPicture(File picture) {
        this.picture = picture;
    }

    public void setContext(File context) {
        this.context = context;
    }

    public File getContext() {
        return context;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public ModelOfStudent(int id, String stuName, int age, String sex, String gradeName) {
        this.id = id;
        this.stuName = stuName;
        this.age = age;
        this.sex = sex;
        this.gradeName = gradeName;
    }

    public ModelOfStudent(String stuName, int age, String sex, String gradeName, File context) {
        this.stuName = stuName;
        this.age = age;
        this.sex = sex;
        this.gradeName = gradeName;
        this.context = context;
    }

    public ModelOfStudent(String stuName, int age, String sex, String gradeName, File context, File picture) {
        this.stuName = stuName;
        this.age = age;
        this.sex = sex;
        this.gradeName = gradeName;
        this.context = context;
        this.picture = picture;
    }
}

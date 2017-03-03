package com.raycloud.myproject.test.entity;

/**
 * Created by 001117020015 on 2017/2/23.
 */
public class UserPage {
    private int page;
    private String name;
    public UserPage() {
    }

    public UserPage(int page, String name) {
        this.page = page;
        this.name = name;
    }


    public int getPage() {
        return page;
    }

    public String getName() {
        return name;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserPage{" +
                "page=" + page +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserPage)) return false;

        UserPage userPage = (UserPage) o;

        if (page != userPage.page) return false;
        if (name != null ? !name.equals(userPage.name) : userPage.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = page;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

package com.naberss.testing_fundamentals.Project2;

public enum project2_Enum {

    test1(0), test2(1);

    private int id;

    project2_Enum(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static project2_Enum valueOf(int id) {
        for (project2_Enum p2 : project2_Enum.values()) {
            if (id == p2.id) {
                return p2;
            }
        }
        throw new IllegalArgumentException("parameter not found");

    }

}

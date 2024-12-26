package com.project.school_management_and_accounting.enums;

public enum Gender {
    MALE, FEMALE;

    public static Gender getGender(String g) {
        if (g.toUpperCase() == "FEMALE")
            return Gender.FEMALE;
        else {
            return Gender.MALE;
        }
    }
}

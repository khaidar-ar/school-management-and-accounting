package com.project.school_management_and_accounting.enums;

public enum BloodGroup {
    A, AB, B, O;

    public static BloodGroup getBG(String b) {
        switch (b.toUpperCase()) {
            case "A":
                return BloodGroup.A;
            case "B":
                return BloodGroup.B;
            case "AB":
                return BloodGroup.AB;
            default:
                return BloodGroup.O;
        }
    }
}

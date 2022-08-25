package com.careeco.studentmanagement.model;//sample file i have created


public class Department{

    private  String deptId;
    private String departmentName;
    private String hodOfDept;

    private String collegeName;
    private String name;
    private  String departmentStudent;
    // I have added one line
    // I am adding one comment on remote
    // Updated for chekcing

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getHodOfDept() {
        return hodOfDept;
    }

    public void setHodOfDept(String hodOfDept) {
        this.hodOfDept = hodOfDept;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId='" + deptId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", hodOfDept='" + hodOfDept + '\'' +
                '}';
    }
}

package com.owenguo.composite.improve;

/**
 * 组织
 */
public abstract class OrganizationComponent {

    /**
     * 名称
     */
    private String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 添加
     *
     * @param organizationComponent
     */
    public void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 删除
     *
     * @param organizationComponent
     */
    public void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 打印组织
     */
    public abstract void print();
}

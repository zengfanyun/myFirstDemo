package com.my.entity;

public class ProductDesc {
    
    private Integer id;

    private Integer productId;

    private String productDesc;

    
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_desc.id
     *
     * @param id the value for product_desc.id
     *
     * @mbg.generated Tue Aug 15 19:15:27 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_desc.product_id
     *
     * @return the value of product_desc.product_id
     *
     * @mbg.generated Tue Aug 15 19:15:27 CST 2017
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_desc.product_id
     *
     * @param productId the value for product_desc.product_id
     *
     * @mbg.generated Tue Aug 15 19:15:27 CST 2017
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_desc.product_desc
     *
     * @return the value of product_desc.product_desc
     *
     * @mbg.generated Tue Aug 15 19:15:27 CST 2017
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_desc.product_desc
     *
     * @param productDesc the value for product_desc.product_desc
     *
     * @mbg.generated Tue Aug 15 19:15:27 CST 2017
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }
}
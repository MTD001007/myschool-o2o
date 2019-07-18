package com.iweb.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Product{
  private Long productId;
  private String productName;
  private String productDesc;
  private String imgAddr;// 简略图
  private String normalPrice;
  private String promotionPrice;
  private Integer priority;
  private Date createTime;
  private Date lastEditTime;
  private Integer enableStatus;
  private Integer point;

  private List<ProductImg> productImgList;
  private ProductCategory productCategory;
  private Shop shop;

}
 
 
package com.my.entity;

import java.util.List;

public class Page {
   private Integer currentPage;
   private List<Product> list;
   private long pageCount;
   private long total;
   private int[] navigatecurrentPages;
   private int navigatepageCount;

   private void calcNavigatecurrentPages() {
       if (pageCount <= navigatepageCount) {
           navigatecurrentPages = new int[(int) pageCount];
           for (int i = 0; i < pageCount; i++) {
               navigatecurrentPages[i] = i + 1;
           }
       } else { 
           navigatecurrentPages = new int[navigatepageCount];
           int startNum = currentPage - navigatepageCount / 2;
           int endNum = currentPage + navigatepageCount / 2;

           if (startNum < 1) {
               startNum = 1;
               for (int i = 0; i < navigatepageCount; i++) {
                   navigatecurrentPages[i] = startNum++;
               }
           } else if (endNum > pageCount) {
               endNum = (int) pageCount;
               for (int i = navigatepageCount - 1; i >= 0; i--) {
                   navigatecurrentPages[i] = endNum--;
               }
           } else {
               for (int i = 0; i < navigatepageCount; i++) {
                   navigatecurrentPages[i] = startNum++;
               }
           }
       }
   }
   
public Integer getCurrentPage() {
	return currentPage;
}

public void setCurrentPage(Integer currentPage) {
	this.currentPage = currentPage;
}

public int[] getNavigatecurrentPages() {
	return navigatecurrentPages;
}

public void setNavigatecurrentPages(int[] navigatecurrentPages) {
	this.navigatecurrentPages = navigatecurrentPages;
}

public int getNavigatepageCount() {
	return navigatepageCount;
}

public void setNavigatepageCount(int navigatepageCount) {
	this.navigatepageCount = navigatepageCount;
	calcNavigatecurrentPages();
}

public long getTotal() {
	return total;
}

public void setTotal(long total) {
	this.total = total;
}

public long getPageCount() {
	return pageCount;
}

public void setPageCount(long pageCount) {
	this.pageCount = pageCount;
}



public List<Product> getList() {
	return list;
}

public void setList(List<Product> list) {
	this.list = list;
}

@Override
public String toString() {
	return "Page [currentPage=" + currentPage + ", list=" + list + ", pageCount=" + pageCount + ", total=" + total
			+ "]";
}
  
   
}

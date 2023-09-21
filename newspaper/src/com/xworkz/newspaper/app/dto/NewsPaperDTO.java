package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class NewsPaperDTO implements Serializable {

	

		private String name;
		private String publisher;
		private double cost;
		private int pages;

		public NewsPaperDTO() {
			// TODO Auto-generated constructor stub
		}

		public  NewsPaperDTO(String name, String publisher, int cost, int pages) {
			
			this.name = name;
			this.publisher = publisher;
			this.cost = cost;
			this.pages = pages;
		}
		
		@Override
		public boolean equals(Object obj) {
			
			System.out.println("running equals in NewsPaperDTO");
			if(obj!=null)
			{
				if(obj instanceof NewsPaperDTO)
				{
					NewsPaperDTO casted=(NewsPaperDTO)obj;
					if(this.publisher.equals(casted.publisher)&& this.name.equals(casted.name))
					{
						System.out.println("Instance are same");
						return true;
					}
				}
			}	
		return false;
		}
		

		@Override
		public String toString() {
			return "NewsPaperDTO [name=" + name + ", publisher=" + publisher + ", cost=" + cost + ", pages=" + pages
					+ "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

		public int getPages() {
			return pages;
		}

		public void setPages(int pages) {
			this.pages = pages;
		}
		
		

	}



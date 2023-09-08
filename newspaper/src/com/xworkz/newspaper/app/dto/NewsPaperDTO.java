package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class NewsPaperDTO implements Serializable {

	

		private String name;
		private String publisher;
		private double cost;
		private int pages;

		public void name() {

		}

		public void Newspaper(String name, String publisher, int cost, int pages) {
			
			this.name = name;
			this.publisher = publisher;
			this.cost = cost;
			this.pages = pages;
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



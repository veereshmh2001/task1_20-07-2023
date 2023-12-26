package com.xworkz.backUp.dto;

import java.time.LocalDate;

public class CountryDTO implements Comparable<CountryDTO> {

	private int id;
	private String name;
	private String capitalCity;
	private long population;
	private boolean independent;
	private LocalDate independenceDate;
	private int noOfStates;
	private String primaryReligion;
	private String nationalAnimal;
	private String nationalBird;

	public CountryDTO() {
		// TODO Auto-generated constructor stub
	}

	public CountryDTO(int id, String name, String capitalCity, long population, boolean independent,
			LocalDate independenceDate, int noOfStates, String primaryReligion, String nationalAnimal,
			String nationalBird) {
		super();
		this.id = id;
		this.name = name;
		this.capitalCity = capitalCity;
		this.population = population;
		this.independent = independent;
		this.independenceDate = independenceDate;
		this.noOfStates = noOfStates;
		this.primaryReligion = primaryReligion;
		this.nationalAnimal = nationalAnimal;
		this.nationalBird = nationalBird;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public boolean isIndependent() {
		return independent;
	}

	public void setIndependent(boolean independent) {
		this.independent = independent;
	}

	public LocalDate getIndependenceDate() {
		return independenceDate;
	}

	public void setIndependenceDate(LocalDate independenceDate) {
		this.independenceDate = independenceDate;
	}

	public int getNoOfStates() {
		return noOfStates;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	public String getPrimaryReligion() {
		return primaryReligion;
	}

	public void setPrimaryReligion(String primaryReligion) {
		this.primaryReligion = primaryReligion;
	}

	public String getNationalAnimal() {
		return nationalAnimal;
	}

	public void setNationalAnimal(String nationalAnimal) {
		this.nationalAnimal = nationalAnimal;
	}

	public String getNationalBird() {
		return nationalBird;
	}

	public void setNationalBird(String nationalBird) {
		this.nationalBird = nationalBird;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capitalCity == null) ? 0 : capitalCity.hashCode());
		result = prime * result + id;
		result = prime * result + ((independenceDate == null) ? 0 : independenceDate.hashCode());
		result = prime * result + (independent ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nationalAnimal == null) ? 0 : nationalAnimal.hashCode());
		result = prime * result + ((nationalBird == null) ? 0 : nationalBird.hashCode());
		result = prime * result + noOfStates;
		result = prime * result + (int) (population ^ (population >>> 32));
		result = prime * result + ((primaryReligion == null) ? 0 : primaryReligion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CountryDTO) {
			System.out.println("dto equals");
			CountryDTO ref = (CountryDTO) obj;
			if (this.name.equalsIgnoreCase(ref.getName()))
				System.out.println("name matching");
				;
		} else {
			System.out.println("not matching");
			return false;
		}

		return false;
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", name=" + name + ", capitalCity=" + capitalCity + ", population=" + population
				+ ", independent=" + independent + ", independenceDate=" + independenceDate + ", noOfStates="
				+ noOfStates + ", primaryReligion=" + primaryReligion + ", nationalAnimal=" + nationalAnimal
				+ ", nationalBird=" + nationalBird + "]";
	}

	@Override
	public int compareTo(CountryDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("running in compareTo");
		return this.name.compareToIgnoreCase(dto.getName());
	}

}

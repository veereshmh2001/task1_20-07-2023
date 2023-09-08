package com.xworkz.crud.app.reopsitory;

public class TrainNoRepositoryImpl implements TrainNoRepository {

	private String[] trainNumbers = new String[TOTAL_NUMBERS];
	private int position = 0;

	@Override
	public void save(String trainNumber) {
		System.out.println("invoking trainNumbers from Repository " + this.getClass().getSimpleName());
		if (position < TOTAL_NUMBERS) {
			this.trainNumbers[position] = trainNumber;
			System.out.println("Numbers is " + trainNumber + "save");
			this.position++;
		} else {
			System.err.println("trainNumber is not avalaible");
		}

	}

	@Override
	public boolean isExist(String trainNumber) {
		for (int i = 0; i <= position; i++) {
			String temp = this.trainNumbers[i];
			if (temp != null && temp.equals(trainNumber)) {
				System.out.println("already exist");
				return true;
			}

		}

		return false;
	}

}

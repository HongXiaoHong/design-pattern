package peron.hong.create.factory.abstractive;

public class HongFarm implements Farm {

	@Override
	public Animal newAnimal() {
		return new Pig();
	}

	@Override
	public Plant newPlant() {
		return new Apple();
	}

}

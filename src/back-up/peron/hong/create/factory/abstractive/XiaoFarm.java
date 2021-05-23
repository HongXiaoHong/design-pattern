package peron.hong.create.factory.abstractive;

public class XiaoFarm implements Farm{

	@Override
	public Animal newAnimal() {
		return new Cow();
	}

	@Override
	public Plant newPlant() {
		return new Pear();
	}

}

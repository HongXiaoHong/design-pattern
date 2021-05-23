package peron.hong.action.interpreter;

public class Context {

	String[] cities = new String[]{"潮州", "广州"};
	String[] persons = new String[]{"小孩", "老人", "孕妇", "残疾人"};
	Expression cityPerson ;
	public Context() {
		Expression city = new TerminalExpression(cities);
		Expression person = new TerminalExpression(persons);
		
		cityPerson = new AndExpressicm(city, person);
	}
	public boolean freeRide(String info) {
		return cityPerson.interpret(info);
	}
}

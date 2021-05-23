package peron.hong.action.interpreter;

public class Context {

	String[] cities = new String[]{"����", "����"};
	String[] persons = new String[]{"С��", "����", "�и�", "�м���"};
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

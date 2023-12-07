package in.com.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestent {

	public static void main(String[] args) {
		List<Contestent> list = new ArrayList<>();
		list.add(new Contestent("rahul", "1"));
		list.add(new Contestent("umesh", "2"));
		list.add(new Contestent("shubham", "5"));
		list.add(new Contestent("ravi", "7"));
		list.add(new Contestent("rahul", "6"));
		list.add(new Contestent("rahul", "10"));
		list.add(new Contestent("rahul", "4"));
		list.add(new Contestent("rakesh", "9"));
		list.add(new Contestent("ahul", "3"));
		list.stream().map(e->e.name).filter(e->e.length()==4).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),e->{Collections.shuffle(e);return e.stream();})).limit(3).forEach(e->{System.out.println(e);});
		

	}

}

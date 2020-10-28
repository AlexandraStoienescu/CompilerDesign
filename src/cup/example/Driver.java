package cup.example;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;

import java_cup.runtime.*;

class Driver {

	public static void main(String[] args) throws Exception {
		Parser parser = new Parser();
		parser.parse();
	}
	
}
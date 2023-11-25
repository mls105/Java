package com.lightbend.lagom.maven_archetype_lagom_java.main.Maps;

public class Name {

//	public final String parent;
	public final String localName;

	public Name(String localName) {
		this.localName = localName;
	}

//	public String getParent() {
//		return parent;
//	}

	public String getLocalName() {
		return localName;
	}

}

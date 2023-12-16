package com.lightbend.lagom.maven_archetype_lagom_java.main.Maps;

public class AngryComment implements CommentBuilder{
	
	public AngryComment(String comment) {
		this.comment = comment;
	}

	public AngryComment() {
		super();
	}

	private String comment;

	@Override
	public void setComment(String comment) {
		// very angry. append !!!
		this.comment = comment + "!!!!!";
	}
	
	public String getComment()
	{
		return comment;
	}

}

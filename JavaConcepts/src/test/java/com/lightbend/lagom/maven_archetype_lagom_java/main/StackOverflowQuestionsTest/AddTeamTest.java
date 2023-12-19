package com.lightbend.lagom.maven_archetype_lagom_java.main.StackOverflowQuestionsTest;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.lightbend.lagom.maven_archetype_lagom_java.main.StackOverflowQuestions.AddTeam;

public class AddTeamTest {

    @Test
    public void sanitize() {

        AddTeam team = new AddTeam();

        String input1 = "abc123";
        String expected1 = "abc123";
        assertEquals(expected1, team.sanitize(input1));
    }
}
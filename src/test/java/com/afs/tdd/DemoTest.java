package com.afs.tdd;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_x_0_y_1_heading_N_when_move_rover_given_x_0_y_0_heading_N() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        List<String> commands = new CommandSplitter("M").getCommandList();

        //when
        marsRover.executeBatchCommand(commands);

        //should
        assertEquals(0,marsRover.getLocationX());
        assertEquals(1,marsRover.getLocationY());
        assertEquals("N",marsRover.getHeading());
    }

    @Test
    void should_return_x_0_y_negative_1_heading_S_when_move_rover_given_x_0_y_0_heading_S() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        List<String> commands = new CommandSplitter("M").getCommandList();

        //when
        marsRover.executeBatchCommand(commands);

        //should
        assertEquals(0,marsRover.getLocationX());
        assertEquals(-1,marsRover.getLocationY());
        assertEquals("S",marsRover.getHeading());
    }

    @Test
    void should_return_x_1_y_0_heading_E_when_move_rover_given_x_0_y_0_heading_E() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        List<String> commands = new CommandSplitter("M").getCommandList();

        //when
        marsRover.executeBatchCommand(commands);

        //should
        assertEquals(1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getHeading());
    }

    @Test
    void should_return_x_negative_1_y_0_heading_W_when_move_rover_given_x_0_y_0_heading_W() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        List<String> commands = new CommandSplitter("M").getCommandList();

        //when
        marsRover.executeBatchCommand(commands);

        //should
        assertEquals(-1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_W_when_change_heading_left_given_x_0_y_0_heading_N() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        List<String> commands = new CommandSplitter("L").getCommandList();

        //when
        marsRover.executeBatchCommand(commands);

        //should
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getHeading());
    }
}

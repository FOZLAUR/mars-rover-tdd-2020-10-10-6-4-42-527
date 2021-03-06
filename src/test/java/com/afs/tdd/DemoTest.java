package com.afs.tdd;

import exceptions.CommandNotDefinedException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {
    @Test
    void should_return_x_0_y_1_heading_N_when_move_rover_given_x_0_y_0_heading_N() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        List<String> commands = new CommandSplitter("M").getCommandList();

        //when
        RoverStatus roverStatus = marsRover.executeBatchCommand(commands);

        //should
        assertEquals(0,roverStatus.getX());
        assertEquals(1,roverStatus.getY());
        assertEquals("N",roverStatus.getCurrentHeading());
    }

    @Test
    void should_return_x_0_y_negative_1_heading_S_when_move_rover_given_x_0_y_0_heading_S() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        List<String> commands = new CommandSplitter("M").getCommandList();

        //when
        RoverStatus roverStatus = marsRover.executeBatchCommand(commands);

        //should
        assertEquals(0,roverStatus.getX());
        assertEquals(-1,roverStatus.getY());
        assertEquals("S",roverStatus.getCurrentHeading());
    }

    @Test
    void should_return_x_1_y_0_heading_E_when_move_rover_given_x_0_y_0_heading_E() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        List<String> commands = new CommandSplitter("M").getCommandList();

        //when
        RoverStatus roverStatus = marsRover.executeBatchCommand(commands);

        //should
        assertEquals(1,roverStatus.getX());
        assertEquals(0,roverStatus.getY());
        assertEquals("E",roverStatus.getCurrentHeading());
    }

    @Test
    void should_return_x_negative_1_y_0_heading_W_when_move_rover_given_x_0_y_0_heading_W() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        List<String> commands = new CommandSplitter("M").getCommandList();

        //when
        RoverStatus roverStatus = marsRover.executeBatchCommand(commands);

        //should
        assertEquals(-1,roverStatus.getX());
        assertEquals(0,roverStatus.getY());
        assertEquals("W",roverStatus.getCurrentHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_W_when_change_heading_left_given_x_0_y_0_heading_N() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        List<String> commands = new CommandSplitter("L").getCommandList();

        //when
        RoverStatus roverStatus = marsRover.executeBatchCommand(commands);

        //should
        assertEquals(0,roverStatus.getX());
        assertEquals(0,roverStatus.getY());
        assertEquals("W",roverStatus.getCurrentHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_E_when_change_heading_left_given_x_0_y_0_heading_S() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        List<String> commands = new CommandSplitter("L").getCommandList();

        //when
        RoverStatus roverStatus = marsRover.executeBatchCommand(commands);

        //should
        assertEquals(0,roverStatus.getX());
        assertEquals(0,roverStatus.getY());
        assertEquals("E",roverStatus.getCurrentHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_N_when_change_heading_left_given_x_0_y_0_heading_E() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        List<String> commands = new CommandSplitter("L").getCommandList();

        //when
        RoverStatus roverStatus = marsRover.executeBatchCommand(commands);

        //should
        assertEquals(0,roverStatus.getX());
        assertEquals(0,roverStatus.getY());
        assertEquals("N",roverStatus.getCurrentHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_S_when_change_heading_left_given_x_0_y_0_heading_W() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        List<String> commands = new CommandSplitter("L").getCommandList();

        //when
        RoverStatus roverStatus = marsRover.executeBatchCommand(commands);

        //should
        assertEquals(0,roverStatus.getX());
        assertEquals(0,roverStatus.getY());
        assertEquals("S",roverStatus.getCurrentHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_N_when_change_heading_right_given_x_0_y_0_heading_W() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        List<String> commands = new CommandSplitter("R").getCommandList();

        //when
        RoverStatus roverStatus = marsRover.executeBatchCommand(commands);

        //should
        assertEquals(0,roverStatus.getX());
        assertEquals(0,roverStatus.getY());
        assertEquals("N",roverStatus.getCurrentHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_S_when_change_heading_right_given_x_0_y_0_heading_E() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        List<String> commands = new CommandSplitter("R").getCommandList();

        //when
        RoverStatus roverStatus = marsRover.executeBatchCommand(commands);

        //should
        assertEquals(0,roverStatus.getX());
        assertEquals(0,roverStatus.getY());
        assertEquals("S",roverStatus.getCurrentHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_W_when_change_heading_right_given_x_0_y_0_heading_S() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        List<String> commands = new CommandSplitter("R").getCommandList();

        //when
        RoverStatus roverStatus = marsRover.executeBatchCommand(commands);

        //should
        assertEquals(0,roverStatus.getX());
        assertEquals(0,roverStatus.getY());
        assertEquals("W",roverStatus.getCurrentHeading());
    }

    @Test
    void should_return_x_0_y_0_heading_E_when_change_heading_right_given_x_0_y_0_heading_N() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        List<String> commands = new CommandSplitter("R").getCommandList();

        //when
        RoverStatus roverStatus = marsRover.executeBatchCommand(commands);

        //should
        assertEquals(0,roverStatus.getX());
        assertEquals(0,roverStatus.getY());
        assertEquals("E",roverStatus.getCurrentHeading());
    }

    @Test
    void should_return_x_negative_1_y_1_heading_N_when_execute_given_x_0_y_0_heading_N_command_MLMR() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        List<String> commands = new CommandSplitter("MLMR").getCommandList();

        //when
        RoverStatus roverStatus = marsRover.executeBatchCommand(commands);

        //should
        assertEquals(-1,roverStatus.getX());
        assertEquals(1,roverStatus.getY());
        assertEquals("N",roverStatus.getCurrentHeading());
    }

    @Test
    void should_return_exception_when_get_command_list_given_x_0_y_0_heading_N_command_F() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");

        //when
        assertThrows(CommandNotDefinedException.class, () -> {
            List<String> commands = new CommandSplitter("F").getCommandList();
        });
    }
}

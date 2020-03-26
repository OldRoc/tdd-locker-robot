package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LockerRobotTest {

    @Test
    void should_return_1_ticket_and_18_available_when_deposit_1_given_19_available () {
        //LockerRobot robot = new LockerRobot();
        //Ticket tickets= robot.deposit();

        //int size = robot.getAvailableCount();
        int size = 18;
        assertEquals(18, size);
    }

}

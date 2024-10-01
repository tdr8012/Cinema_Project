package tests;

import org.junit.Test;
import showtime.Showtime;
import user.Attendance;

import static org.junit.Assert.assertEquals;

public class AttendanceTest {

    @Test
    public void testAttendanceUpdate() {
        Attendance attendance = new Attendance();
        Showtime showtime1 = new Showtime(null, null, null, null);
        Showtime showtime2 = new Showtime(null, null, null, null);

        attendance.updateAttendance(showtime1, 50);
        attendance.updateAttendance(showtime2, 70);

        assertEquals(50, attendance.getTicketsSold(showtime1));
        assertEquals(70, attendance.getTicketsSold(showtime2));
    }

    @Test
    public void testTicketsSoldForUnknownShowtime() {
        Attendance attendance = new Attendance();
        Showtime showtime = new Showtime(null, null, null, null);

        assertEquals(0, attendance.getTicketsSold(showtime));
    }
}

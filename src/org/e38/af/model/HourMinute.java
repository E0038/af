package org.e38.af.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by sergi on 9/10/16.
 */
@Embeddable
public class HourMinute {
    @Column(length = 2, name = "hour")
    private int hour = 0;
    @Column(length = 2, name = "minute")
    private int minute = 0;

    public int getHour() {
        return hour;
    }

    public HourMinute setHour(int hour) {
        this.hour = hour;
        return this;
    }

    public int getMinute() {
        return minute;
    }

    public HourMinute setMinute(int minute) {
        this.minute = minute;
        return this;
    }
}

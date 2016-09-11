package org.e38.af.model;

import javax.persistence.Embeddable;
import java.util.Calendar;

/**
 * Created by sergi on 9/10/16.
 */
@Embeddable
public class Periode {
    private boolean repeatYears;
    private Calendar validUntil, validFrom;
}

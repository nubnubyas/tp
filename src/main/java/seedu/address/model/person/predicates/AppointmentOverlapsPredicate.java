package seedu.address.model.person.predicates;

import static seedu.address.logic.parser.CliSyntax.PREFIX_APPOINTMENT;

import java.util.Objects;
import java.util.function.Predicate;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.model.person.Appointment;
import seedu.address.model.person.Person;

/**
 * Tests that a {@code Person}'s {@code Appointment} overlaps with the query Appointment.
 */
public class AppointmentOverlapsPredicate implements Predicate<Person> {
    private final Appointment query;

    public AppointmentOverlapsPredicate(Appointment query) {
        this.query = query;
    }

    @Override
    public boolean test(Person person) {
        return query.overlaps(person.getAppointment().orElse(null));
    }

    @Override
    public int hashCode() {
        return Objects.hash(PREFIX_APPOINTMENT, query);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof AppointmentOverlapsPredicate)) {
            return false;
        }

        AppointmentOverlapsPredicate otherAppointmentOverlapsPredicate = (AppointmentOverlapsPredicate) other;
        return query.equals(otherAppointmentOverlapsPredicate.query);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).add("query", query.toSaveString()).toString();
    }
}

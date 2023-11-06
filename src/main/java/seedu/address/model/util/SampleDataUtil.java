package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.person.Address;
import seedu.address.model.person.Appointment;
import seedu.address.model.person.Email;
import seedu.address.model.person.MedicalHistory;
import seedu.address.model.person.Name;
import seedu.address.model.person.Nric;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.enums.InputSource;
import seedu.address.model.person.exceptions.BadAppointmentFormatException;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    // manual input of sample data to populate app
    public static Person[] getSamplePersons() {
        try {
            return new Person[]{
                new Person(new Name("Alex Yeoh"), new Nric("T0123456F"), new Phone("87438807"),
                        new Email("alexyeoh@example.com"),
                        new Address("Blk 30 Geylang Street 29, #06-40"),
                        Appointment.of("08-Aug-2023, 10:00, 12:00", InputSource.STORAGE),
                        getMedicalHistorySet(),
                        getTagSet("friends")),
                new Person(new Name("Bernice Yu"), new Nric("S0123452F"), new Phone("99272758"),
                        new Email("berniceyu@example.com"),
                        new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"),
                        Appointment.of("08-Aug-2023, 12:00, 14:00", InputSource.STORAGE),
                        getMedicalHistorySet("Diabetes"),
                        getTagSet("colleagues", "friends")),
                new Person(new Name("Charlotte Oliveiro"), new Nric("T0123456Y"), new Phone("93210283"),
                        new Email("charlotte@example.com"),
                        new Address("Blk 11 Ang Mo Kio Street 74, #11-04"),
                        null,
                        getMedicalHistorySet("AB+ Blood"),
                        getTagSet("neighbours")),
                new Person(new Name("David Li"), new Nric("T0123436F"), new Phone("91031282"),
                        new Email("lidavid@example.com"),
                        new Address("Blk 436 Serangoon Gardens Street 26, #16-43"),
                        null,
                        getMedicalHistorySet(),
                        getTagSet("family")),
                new Person(new Name("Irfan Ibrahim"), new Nric("S0123456F"), new Phone("92492021"),
                        new Email("irfan@example.com"),
                        new Address("Blk 47 Tampines Street 20, #17-35"),
                        Appointment.of("08-Aug-2023, 14:00, 16:00", InputSource.STORAGE),
                        getMedicalHistorySet(),
                        getTagSet("classmates")),
                new Person(new Name("Roy Balakrishnan"), new Nric("T0128456F"), new Phone("92624417"),
                        new Email("royb@example.com"),
                        new Address("Blk 45 Aljunied Street 85, #11-31"),
                        null,
                        getMedicalHistorySet("Currently on XYZ Medication"),
                        getTagSet("colleagues"))
            };
        } catch (BadAppointmentFormatException e) {
            throw new IllegalStateException(e);
        }
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<MedicalHistory> getMedicalHistorySet(String... strings) {
        return Arrays.stream(strings)
                .map(MedicalHistory::new)
                .collect(Collectors.toSet());
    }

}

package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.logic.Messages;
import seedu.address.model.Model;
import seedu.address.model.person.predicates.CompositePredicate;

/**
 * Finds and lists all persons in address book whose name contains any of the argument keywords.
 * Keyword matching is case-insensitive.
 */
public class FindCommand extends Command {

    public static final String COMMAND_WORD = "find";

    public static final String COMMAND_WORD_ALIAS = "f";

    public static final String MESSAGE_USAGE = COMMAND_WORD + " or " + COMMAND_WORD_ALIAS
            + ": Finds all Patients by name, ID or Appointment period, and displays them as a list.\n"
            + "Name and ID should contain any of the specified keywords (case-insensitive) input.\n"
            + "Patients whose Appointment overlaps with the given period will be displayed in the list.\n"
            + "If multiple different search fields are specified, patients displayed will match all given fields.\n"
            + "Parameters: n/KEYWORD... OR id/KEYWORD... OR ap/APPOINTMENT [any additional unused conditions]...\n"
            + "Example 1: " + COMMAND_WORD + " n/alice bob charlie \n"
            + "Example 2: " + COMMAND_WORD + " id/S872D \n"
            + "Example 3: " + COMMAND_WORD_ALIAS + " ap/1-Aug 0900 1000";

    private final CompositePredicate predicate;

    /**
     * Creates a {@code FindCommand} to find patients by with the specified composite predicate.
     *
     * @param predicate The predicate to match patients by.
     * @throws NullPointerException if {@code predicate} is null.
     */
    public FindCommand(CompositePredicate predicate) {
        this.predicate = predicate;
    }

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredPersonList(predicate);
        model.updateFoundPersonsList(predicate);
        if (model.getFilteredPersonList().isEmpty()) {
            return new CommandResult(Messages.MESSAGE_NO_PATIENT_FOUND);
        } else {
            return new CommandResult(
                    String.format(Messages.MESSAGE_PERSON_LISTED_OVERVIEW, model.getFilteredPersonList().size()));
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof FindCommand)) {
            return false;
        }

        FindCommand otherFindCommand = (FindCommand) other;
        return predicate.equals(otherFindCommand.predicate);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("predicate", predicate)
                .toString();
    }
}

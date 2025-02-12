package yesithv.records;

/**
 * RECORD:
 * Immutable data classes
 * For every field: private, final, getter
 * Methods: public constructor, equals, hasCode, ToString
 */

public record Person(String name, Integer salary) {
}

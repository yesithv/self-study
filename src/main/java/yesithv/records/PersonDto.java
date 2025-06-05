package yesithv.records;

/**
 * RECORD: ideals for api responses,
 * Immutable data classes
 * For every field: private, final, getter
 * Methods: public constructor, equals, hasCode, ToString
 */

public record PersonDto(String name, Integer salary) {
}
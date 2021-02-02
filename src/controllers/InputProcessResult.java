package controllers;

/**
 * enums for the different InputProcessResults that are to be used/handled by the controllers
 */
public enum InputProcessResult {
    SUCCESS,
    SUCCESSFUL_SPEAKER_LOGIN,
    SUCCESSFUL_ORGANIZER_LOGIN,
    SUCCESSFUL_ATTENDEE_LOGIN,
    SUCCESSFUL_ADMIN_LOGIN,
    SUCCESSFUL_VIP_LOGIN,
    USERNAME_TAKEN,
    INVALID_INPUT,
    EVENT_DOES_NOT_EXIST,
    USER_DID_NOT_ORGANIZE_EVENT,
    INCORRECT_PASSWORD,
    USER_NOT_FOUND,
    SPEAKER_OCCUPIED,
    TIMESLOT_FULL,
    CAPACITY_OVER,
    ROOM_FULL,
    INVALID_TIME,
    USER_NOT_SPEAKER,
    EVENT_NOT_FOUND,
    EVENT_IS_FULL,
    EVENT_FOR_VIPONLY,
    USER_ALREADY_ENROLLED,
    USER_NEVER_ENROLLED,
    INVALID_USER_TYPE,
    NO_MESSAGE_HISTORY,
    NO_MESSAGE_DETECTED,
    EVENT_NAME_TAKEN,
    NO_PASSWORD_GIVEN,
    NO_USERNAME_GIVEN,
    INVALID_TIME_INPUT,
}
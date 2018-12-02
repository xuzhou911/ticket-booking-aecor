package ru.pavkin.booking.booking.entity

sealed trait BookingCommandRejection

case object BookingAlreadyExists extends BookingCommandRejection
case object BookingNotFound extends BookingCommandRejection
case object TooManySeats extends BookingCommandRejection
case object DuplicateSeats extends BookingCommandRejection
case object BookingIsNotConfirmed extends BookingCommandRejection
case object BookingIsAlreadyCanceled extends BookingCommandRejection
case object BookingIsAlreadyConfirmed extends BookingCommandRejection
case object BookingIsAlreadySettled extends BookingCommandRejection
case object BookingIsDenied extends BookingCommandRejection
case object TooEarlyToExpire extends BookingCommandRejection

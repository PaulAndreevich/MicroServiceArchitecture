package com.example.Seats;

public class SeatNotFoundException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public SeatNotFoundException(Long id) {
            super("Could not find Seat " + id);
        }
}

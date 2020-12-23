##Booking
``Get`` all bookings details http://localhost:8080/v1/api/booking/
- request returns details of all bookings that exist within the API.

````
[
{
"booking_id": 1,
"name": "Hong",
"lastname": "Wintheiser",
"price": 511.45,
"paid": true,
"city": "Port Sammiemouth",
"languages": [
"English",
"German",
"French"
],
"booking_dates": {
"checkIn": "2020-12-09",
"checkOut": "2020-12-23"
},
"additional_needs": "n/a"
},

...

{
"booking_id": 15,
"name": "Pearly",
"lastname": "Casper",
"price": 889.84,
"paid": true,
"city": "Shariceville",
"languages": [
"English",
"German",
"French"
],
"booking_dates": {
"checkIn": "2020-12-13",
"checkOut": "2021-01-06"
},
"additional_needs": "Breakfast"
}
]
````

``Get`` one booking detail by id http://localhost:8080/v1/api/booking/:id
- request returns details of a single bookings that exist within the API.
````
{
"booking_id": 1,
"name": "Hong",
"lastname": "Wintheiser",
"price": 511.45,
"paid": true,
"city": "Port Sammiemouth",
"languages": [
"English",
"German",
"French"
],
"booking_dates": {
"checkIn": "2020-12-09",
"checkOut": "2020-12-23"
},
"additional_needs": "n/a"
}
  ````
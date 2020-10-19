# Citrics - C Java Spring Boot BE

## Introduction

This is a basic database scheme with users, user cities, cities. This Java Spring REST API application will provide endpoints for clients to read various data sets contained in the application's data. User authentication is provided third party by Okta.

## Base URL
- https://labs27-c-citrics-api.herokuapp.com/

## Swagger Documentation
- https://labs27-c-citrics-api.herokuapp.com/swagger-ui.html#/

<details>
<summary>http://localhost:2019/cities/city/4</summary>

```JSON
{
    "cityid": 29401,
    "citynamestate": "West Sacramento, California",
    "statecode": "CA",
    "timezone": "UTC-8 Pacific",
    "latitude": 38.5804609,
    "logitude": -121.530234,
    "fpis": null,
    "gnis": null,
    "wikiimgurl": "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Sacramento-river-bank-pyramid-20.4.jpg/500px-Sacramento-river-bank-pyramid-20.4.jpg",
    "website": "www.cityofwestsacramento.org",
    "population": 53512.0,
    "densitymisq": 2492.73,
    "densitykmsq": 962.46,
    "averageage": 33.7,
    "householdincome": 63558.0,
    "individualincome": 29468.0,
    "averagehouse": 353559.0,
    "rent": 987.0,
    "costoflivingindex": null,
    "acastatus": null,
    "zipcodes": [
        {
            "code": "95691"
        },
        {
            "code": "95605"
        }
    ],
    "counties": [
        {
            "name": "Yolo"
        }
    ],
    "populationhist": [
        {
            "pop": 48744.0
        },
        {
            "pop": 49106.0
        },
        {
            "pop": 49528.0
        },
        {
            "pop": 49978.0
        },
        {
            "pop": 51637.0
        },
        {
            "pop": 52431.0
        },
        {
            "pop": 52933.0
        },
        {
            "pop": 53304.0
        },
        {
            "pop": 53601.0
        },
        {
            "pop": 53519.0
        }
    ],
    "historicalincome": [
        {
            "year": 2019,
            "individualincome": 51676,
            "householdincome": 80440
        },
        {
            "year": 2018,
            "individualincome": 48563,
            "householdincome": 75277
        },
        {
            "year": 2017,
            "individualincome": 46599,
            "householdincome": 71805
        },
        {
            "year": 2016,
            "individualincome": 44115,
            "householdincome": 67739
        },
        {
            "year": 2015,
            "individualincome": 42068,
            "householdincome": 64500
        },
        {
            "year": 2014,
            "individualincome": 40842,
            "householdincome": 61933
        },
        {
            "year": 2013,
            "individualincome": 40319,
            "householdincome": 60190
        },
        {
            "year": 2012,
            "individualincome": 39504,
            "householdincome": 58328
        },
        {
            "year": 2011,
            "individualincome": 37584,
            "householdincome": 57287
        },
        {
            "year": 2010,
            "individualincome": 38460,
            "householdincome": 57708
        }
    ],
    "historicalaveragehouse": [
        {
            "year": 2010,
            "month": 1,
            "housingcost": 229647
        },
        {
            "year": 2010,
            "month": 2,
            "housingcost": 228281
        },
        {
            "year": 2010,
            "month": 3,
            "housingcost": 229655
        },
        {
            "year": 2010,
            "month": 4,
            "housingcost": 230539
        },
        {
            "year": 2010,
            "month": 5,
            "housingcost": 231481
        },
        {
            "year": 2010,
            "month": 6,
            "housingcost": 231910
        },
        {
            "year": 2010,
            "month": 7,
            "housingcost": 232365
        },
        {
            "year": 2010,
            "month": 8,
            "housingcost": 231236
        },
        {
            "year": 2010,
            "month": 9,
            "housingcost": 228548
        },
        {
            "year": 2010,
            "month": 10,
            "housingcost": 226145
        },
        {
            "year": 2010,
            "month": 11,
            "housingcost": 222545
        },
        {
            "year": 2010,
            "month": 12,
            "housingcost": 221547
        },
        {
            "year": 2011,
            "month": 1,
            "housingcost": 218879
        },
        {
            "year": 2011,
            "month": 2,
            "housingcost": 217172
        },
        {
            "year": 2011,
            "month": 3,
            "housingcost": 214844
        },
        {
            "year": 2011,
            "month": 4,
            "housingcost": 212277
        },
        {
            "year": 2011,
            "month": 5,
            "housingcost": 208565
        },
        {
            "year": 2011,
            "month": 6,
            "housingcost": 204453
        },
        {
            "year": 2011,
            "month": 7,
            "housingcost": 202420
        },
        {
            "year": 2011,
            "month": 8,
            "housingcost": 200549
        },
        {
            "year": 2011,
            "month": 9,
            "housingcost": 198729
        },
        {
            "year": 2011,
            "month": 10,
            "housingcost": 195867
        },
        {
            "year": 2011,
            "month": 11,
            "housingcost": 193920
        },
        {
            "year": 2011,
            "month": 12,
            "housingcost": 191294
        },
        {
            "year": 2012,
            "month": 1,
            "housingcost": 190284
        },
        {
            "year": 2012,
            "month": 2,
            "housingcost": 189533
        },
        {
            "year": 2012,
            "month": 3,
            "housingcost": 189679
        },
        {
            "year": 2012,
            "month": 4,
            "housingcost": 190025
        },
        {
            "year": 2012,
            "month": 5,
            "housingcost": 190864
        },
        {
            "year": 2012,
            "month": 6,
            "housingcost": 191531
        },
        {
            "year": 2012,
            "month": 7,
            "housingcost": 191307
        },
        {
            "year": 2012,
            "month": 8,
            "housingcost": 191465
        },
        {
            "year": 2012,
            "month": 9,
            "housingcost": 193339
        },
        {
            "year": 2012,
            "month": 10,
            "housingcost": 196241
        },
        {
            "year": 2012,
            "month": 11,
            "housingcost": 200568
        },
        {
            "year": 2012,
            "month": 12,
            "housingcost": 204068
        },
        {
            "year": 2013,
            "month": 1,
            "housingcost": 206212
        },
        {
            "year": 2013,
            "month": 2,
            "housingcost": 207834
        },
        {
            "year": 2013,
            "month": 3,
            "housingcost": 209900
        },
        {
            "year": 2013,
            "month": 4,
            "housingcost": 213005
        },
        {
            "year": 2013,
            "month": 5,
            "housingcost": 217770
        },
        {
            "year": 2013,
            "month": 6,
            "housingcost": 224047
        },
        {
            "year": 2013,
            "month": 7,
            "housingcost": 232034
        },
        {
            "year": 2013,
            "month": 8,
            "housingcost": 240803
        },
        {
            "year": 2013,
            "month": 9,
            "housingcost": 248464
        },
        {
            "year": 2013,
            "month": 10,
            "housingcost": 255761
        },
        {
            "year": 2013,
            "month": 11,
            "housingcost": 260110
        },
        {
            "year": 2013,
            "month": 12,
            "housingcost": 265799
        },
        {
            "year": 2014,
            "month": 1,
            "housingcost": 271972
        },
        {
            "year": 2014,
            "month": 2,
            "housingcost": 277634
        },
        {
            "year": 2014,
            "month": 3,
            "housingcost": 281298
        },
        {
            "year": 2014,
            "month": 4,
            "housingcost": 283764
        },
        {
            "year": 2014,
            "month": 5,
            "housingcost": 286290
        },
        {
            "year": 2014,
            "month": 6,
            "housingcost": 288960
        },
        {
            "year": 2014,
            "month": 7,
            "housingcost": 288396
        },
        {
            "year": 2014,
            "month": 8,
            "housingcost": 286806
        },
        {
            "year": 2014,
            "month": 9,
            "housingcost": 284510
        },
        {
            "year": 2014,
            "month": 10,
            "housingcost": 283223
        },
        {
            "year": 2014,
            "month": 11,
            "housingcost": 284570
        },
        {
            "year": 2014,
            "month": 12,
            "housingcost": 284761
        },
        {
            "year": 2015,
            "month": 1,
            "housingcost": 285620
        },
        {
            "year": 2015,
            "month": 2,
            "housingcost": 287121
        },
        {
            "year": 2015,
            "month": 3,
            "housingcost": 290400
        },
        {
            "year": 2015,
            "month": 4,
            "housingcost": 293845
        },
        {
            "year": 2015,
            "month": 5,
            "housingcost": 294931
        },
        {
            "year": 2015,
            "month": 6,
            "housingcost": 294950
        },
        {
            "year": 2015,
            "month": 7,
            "housingcost": 296593
        },
        {
            "year": 2015,
            "month": 8,
            "housingcost": 300360
        },
        {
            "year": 2015,
            "month": 9,
            "housingcost": 304534
        },
        {
            "year": 2015,
            "month": 10,
            "housingcost": 308557
        },
        {
            "year": 2015,
            "month": 11,
            "housingcost": 311189
        },
        {
            "year": 2015,
            "month": 12,
            "housingcost": 315242
        },
        {
            "year": 2016,
            "month": 1,
            "housingcost": 319387
        },
        {
            "year": 2016,
            "month": 2,
            "housingcost": 322117
        },
        {
            "year": 2016,
            "month": 3,
            "housingcost": 323586
        },
        {
            "year": 2016,
            "month": 4,
            "housingcost": 324864
        },
        {
            "year": 2016,
            "month": 5,
            "housingcost": 328170
        },
        {
            "year": 2016,
            "month": 6,
            "housingcost": 331398
        },
        {
            "year": 2016,
            "month": 7,
            "housingcost": 334875
        },
        {
            "year": 2016,
            "month": 8,
            "housingcost": 336269
        },
        {
            "year": 2016,
            "month": 9,
            "housingcost": 338034
        },
        {
            "year": 2016,
            "month": 10,
            "housingcost": 339070
        },
        {
            "year": 2016,
            "month": 11,
            "housingcost": 339693
        },
        {
            "year": 2016,
            "month": 12,
            "housingcost": 340711
        },
        {
            "year": 2017,
            "month": 1,
            "housingcost": 341753
        },
        {
            "year": 2017,
            "month": 2,
            "housingcost": 343985
        },
        {
            "year": 2017,
            "month": 3,
            "housingcost": 347059
        },
        {
            "year": 2017,
            "month": 4,
            "housingcost": 349749
        },
        {
            "year": 2017,
            "month": 5,
            "housingcost": 352518
        },
        {
            "year": 2017,
            "month": 6,
            "housingcost": 354269
        },
        {
            "year": 2017,
            "month": 7,
            "housingcost": 355247
        },
        {
            "year": 2017,
            "month": 8,
            "housingcost": 357151
        },
        {
            "year": 2017,
            "month": 9,
            "housingcost": 360162
        },
        {
            "year": 2017,
            "month": 10,
            "housingcost": 363896
        },
        {
            "year": 2017,
            "month": 11,
            "housingcost": 368843
        },
        {
            "year": 2017,
            "month": 12,
            "housingcost": 372273
        },
        {
            "year": 2018,
            "month": 1,
            "housingcost": 374902
        },
        {
            "year": 2018,
            "month": 2,
            "housingcost": 377200
        },
        {
            "year": 2018,
            "month": 3,
            "housingcost": 377412
        },
        {
            "year": 2018,
            "month": 4,
            "housingcost": 377946
        },
        {
            "year": 2018,
            "month": 5,
            "housingcost": 378144
        },
        {
            "year": 2018,
            "month": 6,
            "housingcost": 381482
        },
        {
            "year": 2018,
            "month": 7,
            "housingcost": 385490
        },
        {
            "year": 2018,
            "month": 8,
            "housingcost": 387401
        },
        {
            "year": 2018,
            "month": 9,
            "housingcost": 388461
        },
        {
            "year": 2018,
            "month": 10,
            "housingcost": 390250
        },
        {
            "year": 2018,
            "month": 11,
            "housingcost": 391923
        },
        {
            "year": 2018,
            "month": 12,
            "housingcost": 391531
        },
        {
            "year": 2019,
            "month": 1,
            "housingcost": 387729
        },
        {
            "year": 2019,
            "month": 2,
            "housingcost": 383245
        },
        {
            "year": 2019,
            "month": 3,
            "housingcost": 383064
        },
        {
            "year": 2019,
            "month": 4,
            "housingcost": 385985
        },
        {
            "year": 2019,
            "month": 5,
            "housingcost": 389235
        },
        {
            "year": 2019,
            "month": 6,
            "housingcost": 389617
        },
        {
            "year": 2019,
            "month": 7,
            "housingcost": 389697
        },
        {
            "year": 2019,
            "month": 8,
            "housingcost": 390297
        },
        {
            "year": 2019,
            "month": 9,
            "housingcost": 390187
        },
        {
            "year": 2019,
            "month": 10,
            "housingcost": 388671
        },
        {
            "year": 2019,
            "month": 11,
            "housingcost": 387949
        },
        {
            "year": 2019,
            "month": 12,
            "housingcost": 389252
        },
        {
            "year": 2020,
            "month": 1,
            "housingcost": 393413
        },
        {
            "year": 2020,
            "month": 2,
            "housingcost": 398052
        },
        {
            "year": 2020,
            "month": 3,
            "housingcost": 400240
        },
        {
            "year": 2020,
            "month": 4,
            "housingcost": 400026
        },
        {
            "year": 2020,
            "month": 5,
            "housingcost": 399658
        },
        {
            "year": 2020,
            "month": 6,
            "housingcost": 400360
        },
        {
            "year": 2020,
            "month": 7,
            "housingcost": 401312
        },
        {
            "year": 2020,
            "month": 8,
            "housingcost": 402963
        }
    ],
    "covid": [
        {
            "year": 2020,
            "month": 1,
            "day": 22,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 23,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 24,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 25,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 26,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 27,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 28,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 29,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 30,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 31,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 1,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 2,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 3,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 4,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 5,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 6,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 7,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 8,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 9,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 10,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 11,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 12,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 13,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 14,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 15,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 16,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 17,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 18,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 19,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 20,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 21,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 22,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 23,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 24,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 25,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 26,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 27,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 28,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 29,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 1,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 2,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 3,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 4,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 5,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 6,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 7,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 8,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 9,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 10,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 11,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 12,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 13,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 14,
            "cases": 2
        },
        {
            "year": 2020,
            "month": 3,
            "day": 15,
            "cases": 2
        },
        {
            "year": 2020,
            "month": 3,
            "day": 16,
            "cases": 2
        },
        {
            "year": 2020,
            "month": 3,
            "day": 17,
            "cases": 4
        },
        {
            "year": 2020,
            "month": 3,
            "day": 18,
            "cases": 4
        },
        {
            "year": 2020,
            "month": 3,
            "day": 19,
            "cases": 5
        },
        {
            "year": 2020,
            "month": 3,
            "day": 20,
            "cases": 5
        },
        {
            "year": 2020,
            "month": 3,
            "day": 21,
            "cases": 6
        },
        {
            "year": 2020,
            "month": 3,
            "day": 22,
            "cases": 6
        },
        {
            "year": 2020,
            "month": 3,
            "day": 23,
            "cases": 6
        },
        {
            "year": 2020,
            "month": 3,
            "day": 24,
            "cases": 8
        },
        {
            "year": 2020,
            "month": 3,
            "day": 25,
            "cases": 10
        },
        {
            "year": 2020,
            "month": 3,
            "day": 26,
            "cases": 11
        },
        {
            "year": 2020,
            "month": 3,
            "day": 27,
            "cases": 13
        },
        {
            "year": 2020,
            "month": 3,
            "day": 28,
            "cases": 16
        },
        {
            "year": 2020,
            "month": 3,
            "day": 29,
            "cases": 16
        },
        {
            "year": 2020,
            "month": 3,
            "day": 30,
            "cases": 16
        },
        {
            "year": 2020,
            "month": 3,
            "day": 31,
            "cases": 24
        },
        {
            "year": 2020,
            "month": 4,
            "day": 1,
            "cases": 25
        },
        {
            "year": 2020,
            "month": 4,
            "day": 2,
            "cases": 28
        },
        {
            "year": 2020,
            "month": 4,
            "day": 3,
            "cases": 33
        },
        {
            "year": 2020,
            "month": 4,
            "day": 4,
            "cases": 37
        },
        {
            "year": 2020,
            "month": 4,
            "day": 5,
            "cases": 37
        },
        {
            "year": 2020,
            "month": 4,
            "day": 6,
            "cases": 37
        },
        {
            "year": 2020,
            "month": 4,
            "day": 7,
            "cases": 50
        },
        {
            "year": 2020,
            "month": 4,
            "day": 8,
            "cases": 56
        },
        {
            "year": 2020,
            "month": 4,
            "day": 9,
            "cases": 67
        },
        {
            "year": 2020,
            "month": 4,
            "day": 10,
            "cases": 71
        },
        {
            "year": 2020,
            "month": 4,
            "day": 11,
            "cases": 75
        },
        {
            "year": 2020,
            "month": 4,
            "day": 12,
            "cases": 88
        },
        {
            "year": 2020,
            "month": 4,
            "day": 13,
            "cases": 93
        },
        {
            "year": 2020,
            "month": 4,
            "day": 14,
            "cases": 101
        },
        {
            "year": 2020,
            "month": 4,
            "day": 15,
            "cases": 102
        },
        {
            "year": 2020,
            "month": 4,
            "day": 16,
            "cases": 116
        },
        {
            "year": 2020,
            "month": 4,
            "day": 17,
            "cases": 125
        },
        {
            "year": 2020,
            "month": 4,
            "day": 18,
            "cases": 126
        },
        {
            "year": 2020,
            "month": 4,
            "day": 19,
            "cases": 137
        },
        {
            "year": 2020,
            "month": 4,
            "day": 20,
            "cases": 137
        },
        {
            "year": 2020,
            "month": 4,
            "day": 21,
            "cases": 142
        },
        {
            "year": 2020,
            "month": 4,
            "day": 22,
            "cases": 146
        },
        {
            "year": 2020,
            "month": 4,
            "day": 23,
            "cases": 151
        },
        {
            "year": 2020,
            "month": 4,
            "day": 24,
            "cases": 157
        },
        {
            "year": 2020,
            "month": 4,
            "day": 25,
            "cases": 157
        },
        {
            "year": 2020,
            "month": 4,
            "day": 26,
            "cases": 161
        },
        {
            "year": 2020,
            "month": 4,
            "day": 27,
            "cases": 161
        },
        {
            "year": 2020,
            "month": 4,
            "day": 28,
            "cases": 162
        },
        {
            "year": 2020,
            "month": 4,
            "day": 29,
            "cases": 163
        },
        {
            "year": 2020,
            "month": 4,
            "day": 30,
            "cases": 164
        },
        {
            "year": 2020,
            "month": 5,
            "day": 1,
            "cases": 169
        },
        {
            "year": 2020,
            "month": 5,
            "day": 2,
            "cases": 169
        },
        {
            "year": 2020,
            "month": 5,
            "day": 3,
            "cases": 171
        },
        {
            "year": 2020,
            "month": 5,
            "day": 4,
            "cases": 171
        },
        {
            "year": 2020,
            "month": 5,
            "day": 5,
            "cases": 171
        },
        {
            "year": 2020,
            "month": 5,
            "day": 6,
            "cases": 172
        },
        {
            "year": 2020,
            "month": 5,
            "day": 7,
            "cases": 172
        },
        {
            "year": 2020,
            "month": 5,
            "day": 8,
            "cases": 172
        },
        {
            "year": 2020,
            "month": 5,
            "day": 9,
            "cases": 172
        },
        {
            "year": 2020,
            "month": 5,
            "day": 10,
            "cases": 172
        },
        {
            "year": 2020,
            "month": 5,
            "day": 11,
            "cases": 174
        },
        {
            "year": 2020,
            "month": 5,
            "day": 12,
            "cases": 177
        },
        {
            "year": 2020,
            "month": 5,
            "day": 13,
            "cases": 177
        },
        {
            "year": 2020,
            "month": 5,
            "day": 14,
            "cases": 182
        },
        {
            "year": 2020,
            "month": 5,
            "day": 15,
            "cases": 182
        },
        {
            "year": 2020,
            "month": 5,
            "day": 16,
            "cases": 183
        },
        {
            "year": 2020,
            "month": 5,
            "day": 17,
            "cases": 184
        },
        {
            "year": 2020,
            "month": 5,
            "day": 18,
            "cases": 184
        },
        {
            "year": 2020,
            "month": 5,
            "day": 19,
            "cases": 185
        },
        {
            "year": 2020,
            "month": 5,
            "day": 20,
            "cases": 185
        },
        {
            "year": 2020,
            "month": 5,
            "day": 21,
            "cases": 185
        },
        {
            "year": 2020,
            "month": 5,
            "day": 22,
            "cases": 186
        },
        {
            "year": 2020,
            "month": 5,
            "day": 23,
            "cases": 190
        },
        {
            "year": 2020,
            "month": 5,
            "day": 24,
            "cases": 190
        },
        {
            "year": 2020,
            "month": 5,
            "day": 25,
            "cases": 194
        },
        {
            "year": 2020,
            "month": 5,
            "day": 26,
            "cases": 198
        },
        {
            "year": 2020,
            "month": 5,
            "day": 27,
            "cases": 200
        },
        {
            "year": 2020,
            "month": 5,
            "day": 28,
            "cases": 207
        },
        {
            "year": 2020,
            "month": 5,
            "day": 29,
            "cases": 207
        },
        {
            "year": 2020,
            "month": 5,
            "day": 30,
            "cases": 210
        },
        {
            "year": 2020,
            "month": 5,
            "day": 31,
            "cases": 211
        },
        {
            "year": 2020,
            "month": 6,
            "day": 1,
            "cases": 211
        },
        {
            "year": 2020,
            "month": 6,
            "day": 2,
            "cases": 213
        },
        {
            "year": 2020,
            "month": 6,
            "day": 3,
            "cases": 213
        },
        {
            "year": 2020,
            "month": 6,
            "day": 4,
            "cases": 216
        },
        {
            "year": 2020,
            "month": 6,
            "day": 5,
            "cases": 216
        },
        {
            "year": 2020,
            "month": 6,
            "day": 6,
            "cases": 221
        },
        {
            "year": 2020,
            "month": 6,
            "day": 7,
            "cases": 221
        },
        {
            "year": 2020,
            "month": 6,
            "day": 8,
            "cases": 225
        },
        {
            "year": 2020,
            "month": 6,
            "day": 9,
            "cases": 226
        },
        {
            "year": 2020,
            "month": 6,
            "day": 10,
            "cases": 227
        },
        {
            "year": 2020,
            "month": 6,
            "day": 11,
            "cases": 240
        },
        {
            "year": 2020,
            "month": 6,
            "day": 12,
            "cases": 240
        },
        {
            "year": 2020,
            "month": 6,
            "day": 13,
            "cases": 252
        },
        {
            "year": 2020,
            "month": 6,
            "day": 14,
            "cases": 253
        },
        {
            "year": 2020,
            "month": 6,
            "day": 15,
            "cases": 255
        },
        {
            "year": 2020,
            "month": 6,
            "day": 16,
            "cases": 265
        },
        {
            "year": 2020,
            "month": 6,
            "day": 17,
            "cases": 265
        },
        {
            "year": 2020,
            "month": 6,
            "day": 18,
            "cases": 302
        },
        {
            "year": 2020,
            "month": 6,
            "day": 19,
            "cases": 310
        },
        {
            "year": 2020,
            "month": 6,
            "day": 20,
            "cases": 321
        },
        {
            "year": 2020,
            "month": 6,
            "day": 21,
            "cases": 330
        },
        {
            "year": 2020,
            "month": 6,
            "day": 22,
            "cases": 347
        },
        {
            "year": 2020,
            "month": 6,
            "day": 23,
            "cases": 366
        },
        {
            "year": 2020,
            "month": 6,
            "day": 24,
            "cases": 386
        },
        {
            "year": 2020,
            "month": 6,
            "day": 25,
            "cases": 408
        },
        {
            "year": 2020,
            "month": 6,
            "day": 26,
            "cases": 438
        },
        {
            "year": 2020,
            "month": 6,
            "day": 27,
            "cases": 458
        },
        {
            "year": 2020,
            "month": 6,
            "day": 28,
            "cases": 479
        },
        {
            "year": 2020,
            "month": 6,
            "day": 29,
            "cases": 505
        },
        {
            "year": 2020,
            "month": 6,
            "day": 30,
            "cases": 505
        },
        {
            "year": 2020,
            "month": 7,
            "day": 1,
            "cases": 555
        },
        {
            "year": 2020,
            "month": 7,
            "day": 2,
            "cases": 583
        },
        {
            "year": 2020,
            "month": 7,
            "day": 3,
            "cases": 583
        },
        {
            "year": 2020,
            "month": 7,
            "day": 4,
            "cases": 613
        },
        {
            "year": 2020,
            "month": 7,
            "day": 5,
            "cases": 677
        },
        {
            "year": 2020,
            "month": 7,
            "day": 6,
            "cases": 677
        },
        {
            "year": 2020,
            "month": 7,
            "day": 7,
            "cases": 723
        },
        {
            "year": 2020,
            "month": 7,
            "day": 8,
            "cases": 760
        },
        {
            "year": 2020,
            "month": 7,
            "day": 9,
            "cases": 802
        },
        {
            "year": 2020,
            "month": 7,
            "day": 10,
            "cases": 839
        },
        {
            "year": 2020,
            "month": 7,
            "day": 11,
            "cases": 839
        },
        {
            "year": 2020,
            "month": 7,
            "day": 12,
            "cases": 884
        },
        {
            "year": 2020,
            "month": 7,
            "day": 13,
            "cases": 929
        },
        {
            "year": 2020,
            "month": 7,
            "day": 14,
            "cases": 999
        },
        {
            "year": 2020,
            "month": 7,
            "day": 15,
            "cases": 1023
        },
        {
            "year": 2020,
            "month": 7,
            "day": 16,
            "cases": 1062
        },
        {
            "year": 2020,
            "month": 7,
            "day": 17,
            "cases": 1101
        },
        {
            "year": 2020,
            "month": 7,
            "day": 18,
            "cases": 1101
        },
        {
            "year": 2020,
            "month": 7,
            "day": 19,
            "cases": 1162
        },
        {
            "year": 2020,
            "month": 7,
            "day": 20,
            "cases": 1196
        },
        {
            "year": 2020,
            "month": 7,
            "day": 21,
            "cases": 1200
        },
        {
            "year": 2020,
            "month": 7,
            "day": 22,
            "cases": 1225
        },
        {
            "year": 2020,
            "month": 7,
            "day": 23,
            "cases": 1275
        },
        {
            "year": 2020,
            "month": 7,
            "day": 24,
            "cases": 1315
        },
        {
            "year": 2020,
            "month": 7,
            "day": 25,
            "cases": 1342
        },
        {
            "year": 2020,
            "month": 7,
            "day": 26,
            "cases": 1394
        },
        {
            "year": 2020,
            "month": 7,
            "day": 27,
            "cases": 1424
        },
        {
            "year": 2020,
            "month": 7,
            "day": 28,
            "cases": 1446
        },
        {
            "year": 2020,
            "month": 7,
            "day": 29,
            "cases": 1477
        },
        {
            "year": 2020,
            "month": 7,
            "day": 30,
            "cases": 1494
        },
        {
            "year": 2020,
            "month": 7,
            "day": 31,
            "cases": 1510
        },
        {
            "year": 2020,
            "month": 8,
            "day": 1,
            "cases": 1510
        },
        {
            "year": 2020,
            "month": 8,
            "day": 2,
            "cases": 1544
        },
        {
            "year": 2020,
            "month": 8,
            "day": 3,
            "cases": 1572
        },
        {
            "year": 2020,
            "month": 8,
            "day": 4,
            "cases": 1614
        },
        {
            "year": 2020,
            "month": 8,
            "day": 5,
            "cases": 1614
        },
        {
            "year": 2020,
            "month": 8,
            "day": 6,
            "cases": 1660
        },
        {
            "year": 2020,
            "month": 8,
            "day": 7,
            "cases": 1660
        },
        {
            "year": 2020,
            "month": 8,
            "day": 8,
            "cases": 1690
        },
        {
            "year": 2020,
            "month": 8,
            "day": 9,
            "cases": 1721
        },
        {
            "year": 2020,
            "month": 8,
            "day": 10,
            "cases": 1834
        },
        {
            "year": 2020,
            "month": 8,
            "day": 11,
            "cases": 1834
        },
        {
            "year": 2020,
            "month": 8,
            "day": 12,
            "cases": 1898
        },
        {
            "year": 2020,
            "month": 8,
            "day": 13,
            "cases": 1918
        },
        {
            "year": 2020,
            "month": 8,
            "day": 14,
            "cases": 1966
        },
        {
            "year": 2020,
            "month": 8,
            "day": 15,
            "cases": 1966
        },
        {
            "year": 2020,
            "month": 8,
            "day": 16,
            "cases": 2019
        },
        {
            "year": 2020,
            "month": 8,
            "day": 17,
            "cases": 2046
        },
        {
            "year": 2020,
            "month": 8,
            "day": 18,
            "cases": 2076
        },
        {
            "year": 2020,
            "month": 8,
            "day": 19,
            "cases": 2118
        },
        {
            "year": 2020,
            "month": 8,
            "day": 20,
            "cases": 2147
        },
        {
            "year": 2020,
            "month": 8,
            "day": 21,
            "cases": 2164
        },
        {
            "year": 2020,
            "month": 8,
            "day": 22,
            "cases": 2184
        },
        {
            "year": 2020,
            "month": 8,
            "day": 23,
            "cases": 2205
        },
        {
            "year": 2020,
            "month": 8,
            "day": 24,
            "cases": 2239
        },
        {
            "year": 2020,
            "month": 8,
            "day": 25,
            "cases": 2255
        },
        {
            "year": 2020,
            "month": 8,
            "day": 26,
            "cases": 2274
        },
        {
            "year": 2020,
            "month": 8,
            "day": 27,
            "cases": 2287
        },
        {
            "year": 2020,
            "month": 8,
            "day": 28,
            "cases": 2310
        },
        {
            "year": 2020,
            "month": 8,
            "day": 29,
            "cases": 2335
        },
        {
            "year": 2020,
            "month": 8,
            "day": 30,
            "cases": 2386
        },
        {
            "year": 2020,
            "month": 8,
            "day": 31,
            "cases": 2424
        },
        {
            "year": 2020,
            "month": 9,
            "day": 1,
            "cases": 2438
        },
        {
            "year": 2020,
            "month": 9,
            "day": 2,
            "cases": 2451
        },
        {
            "year": 2020,
            "month": 9,
            "day": 3,
            "cases": 2478
        },
        {
            "year": 2020,
            "month": 9,
            "day": 4,
            "cases": 2495
        },
        {
            "year": 2020,
            "month": 9,
            "day": 5,
            "cases": 2524
        },
        {
            "year": 2020,
            "month": 9,
            "day": 6,
            "cases": 2541
        },
        {
            "year": 2020,
            "month": 9,
            "day": 7,
            "cases": 2564
        },
        {
            "year": 2020,
            "month": 9,
            "day": 8,
            "cases": 2565
        },
        {
            "year": 2020,
            "month": 9,
            "day": 9,
            "cases": 2597
        },
        {
            "year": 2020,
            "month": 9,
            "day": 10,
            "cases": 2611
        },
        {
            "year": 2020,
            "month": 9,
            "day": 11,
            "cases": 2633
        },
        {
            "year": 2020,
            "month": 9,
            "day": 12,
            "cases": 2650
        },
        {
            "year": 2020,
            "month": 9,
            "day": 13,
            "cases": 2677
        },
        {
            "year": 2020,
            "month": 9,
            "day": 14,
            "cases": 2689
        },
        {
            "year": 2020,
            "month": 9,
            "day": 15,
            "cases": 2710
        },
        {
            "year": 2020,
            "month": 9,
            "day": 16,
            "cases": 2710
        },
        {
            "year": 2020,
            "month": 9,
            "day": 17,
            "cases": 2721
        },
        {
            "year": 2020,
            "month": 9,
            "day": 18,
            "cases": 2732
        },
        {
            "year": 2020,
            "month": 9,
            "day": 19,
            "cases": 2740
        },
        {
            "year": 2020,
            "month": 9,
            "day": 20,
            "cases": 2747
        },
        {
            "year": 2020,
            "month": 9,
            "day": 21,
            "cases": 2754
        },
        {
            "year": 2020,
            "month": 9,
            "day": 22,
            "cases": 2765
        },
        {
            "year": 2020,
            "month": 9,
            "day": 23,
            "cases": 2773
        },
        {
            "year": 2020,
            "month": 9,
            "day": 24,
            "cases": 2782
        },
        {
            "year": 2020,
            "month": 9,
            "day": 25,
            "cases": 2789
        },
        {
            "year": 2020,
            "month": 9,
            "day": 26,
            "cases": 2795
        },
        {
            "year": 2020,
            "month": 9,
            "day": 27,
            "cases": 2803
        },
        {
            "year": 2020,
            "month": 9,
            "day": 28,
            "cases": 2815
        },
        {
            "year": 2020,
            "month": 9,
            "day": 29,
            "cases": 2825
        },
        {
            "year": 2020,
            "month": 9,
            "day": 30,
            "cases": 2828
        },
        {
            "year": 2020,
            "month": 10,
            "day": 1,
            "cases": 2836
        },
        {
            "year": 2020,
            "month": 10,
            "day": 2,
            "cases": 2847
        },
        {
            "year": 2020,
            "month": 10,
            "day": 3,
            "cases": 2867
        },
        {
            "year": 2020,
            "month": 10,
            "day": 4,
            "cases": 2879
        },
        {
            "year": 2020,
            "month": 10,
            "day": 5,
            "cases": 2893
        },
        {
            "year": 2020,
            "month": 10,
            "day": 6,
            "cases": 2903
        },
        {
            "year": 2020,
            "month": 10,
            "day": 7,
            "cases": 2909
        },
        {
            "year": 2020,
            "month": 10,
            "day": 8,
            "cases": 2918
        },
        {
            "year": 2020,
            "month": 10,
            "day": 9,
            "cases": 2929
        },
        {
            "year": 2020,
            "month": 10,
            "day": 10,
            "cases": 2942
        },
        {
            "year": 2020,
            "month": 10,
            "day": 11,
            "cases": 2954
        },
        {
            "year": 2020,
            "month": 10,
            "day": 12,
            "cases": 2966
        }
    ],
    "historicalweather": [
        {
            "month": "Sep",
            "precipitation": 0.32,
            "temperature": 71.7
        },
        {
            "month": "Mar",
            "precipitation": 4.1,
            "temperature": 53.4
        },
        {
            "month": "Nov",
            "precipitation": 0.48,
            "temperature": 55.4
        },
        {
            "month": "Apr",
            "precipitation": 0.5,
            "temperature": 62.4
        },
        {
            "month": "Dec",
            "precipitation": 5.31,
            "temperature": 49.7
        },
        {
            "month": "Jan",
            "precipitation": 4.78,
            "temperature": 50.1
        },
        {
            "month": "Jun",
            "precipitation": 0.0,
            "temperature": 73.7
        },
        {
            "month": "Oct",
            "precipitation": 0.0,
            "temperature": 61.9
        },
        {
            "month": "Jul",
            "precipitation": 0.0,
            "temperature": 75.9
        },
        {
            "month": "May",
            "precipitation": 3.12,
            "temperature": 62.7
        },
        {
            "month": "Feb",
            "precipitation": 8.9,
            "temperature": 47.6
        },
        {
            "month": "Aug",
            "precipitation": 0.0,
            "temperature": 77.1
        }
    ]
}
```

</details>

<details>
<summary>http://localhost:2019/cities/avg</summary>

```JSON
{
    "cityid": 0,
    "citynamestate": "National Average, USA",
    "statecode": null,
    "timezone": null,
    "latitude": 34.38796589801588,
    "logitude": -111.70209743019463,
    "fpis": null,
    "gnis": null,
    "wikiimgurl": null,
    "website": null,
    "population": 147225.95238095237,
    "densitymisq": 0.0,
    "densitykmsq": 0.0,
    "averageage": 38.96031746031745,
    "householdincome": 77299.80158730158,
    "individualincome": 38683.166666666664,
    "averagehouse": 596296.5158730159,
    "rent": 1552.6666666666667,
    "costoflivingindex": 0.0,
    "acastatus": null,
    "zipcodes": [],
    "counties": [],
    "populationhist": [
        {
            "pop": 143555.10317460317
        }
    ],
    "historicalincome": [
        {
            "year": 2020,
            "individualincome": 40156,
            "householdincome": 61912
        }
    ],
    "historicalaveragehouse": [
        {
            "year": 2020,
            "month": 10,
            "housingcost": 133152
        }
    ],
    "covid": [
        {
            "year": 2020,
            "month": 10,
            "day": 31,
            "cases": 8998
        }
    ],
    "historicalweather": [
        {
            "month": "Oct",
            "precipitation": 2.537493279569891,
            "temperature": 63.89327956989242
        }
    ]
}
```

</details>


<details>
<summary>http://localhost:2019/cities/allid</summary>

```JSON
[
    {
        "cityid": 1,
        "citynamestate": "Vestavia Hills, Alabama"
    },
    {
        "cityid": 2,
        "citynamestate": "Apache Junction, Arizona"
    },
    {
        "cityid": 3,
        "citynamestate": "Bullhead City, Arizona"
    },
    {
        "cityid": 4,
        "citynamestate": "Casa Grande, Arizona"
    },
    {
        "cityid": 5,
        "citynamestate": "El Mirage, Arizona"
    },
    {
        "cityid": 6,
        "citynamestate": "Lake Havasu City, Arizona"
    },
    {
        "cityid": 7,
        "citynamestate": "Oro Valley, Arizona"
    },
    {
        "cityid": 8,
        "citynamestate": "Prescott Valley, Arizona"
    },
    {
        "cityid": 9,
        "citynamestate": "Sierra Vista, Arizona"
    },
    {
        "cityid": 10,
        "citynamestate": "Fort Smith, Arkansas"
    },
    {
        "cityid": 11,
        "citynamestate": "Hot Springs, Arkansas"
    },
    {
        "cityid": 12,
        "citynamestate": "Little Rock, Arkansas"
    },
    {
        "cityid": 13,
        "citynamestate": "North Little Rock, Arkansas"
    },
    {
        "cityid": 14,
        "citynamestate": "Pine Bluff, Arkansas"
    },
    {
        "cityid": 15,
        "citynamestate": "Aliso Viejo, California"
    },
    {
        "cityid": 16,
        "citynamestate": "Apple Valley, California"
    },
    {
        "cityid": 17,
        "citynamestate": "Baldwin Park, California"
    },
    {
        "cityid": 18,
        "citynamestate": "Bell Gardens, California"
    },
    {
        "cityid": 19,
        "citynamestate": "Beverly Hills, California"
    },
    {
        "cityid": 20,
        "citynamestate": "Buena Park, California"
    },
    {
        "cityid": 21,
        "citynamestate": "Cathedral City, California"
    },
    {
        "cityid": 22,
        "citynamestate": "Chino Hills, California"
    },
    {
        "cityid": 23,
        "citynamestate": "Chula Vista, California"
    },
    {
        "cityid": 24,
        "citynamestate": "Citrus Heights, California"
    },
    {
        "cityid": 25,
        "citynamestate": "Costa Mesa, California"
    }
}
```

</details>

<details>
<summary>http://localhost:2019/users/users</summary>

```JSON
[
    {
        "userid": 4,
        "username": "admin",
        "primaryemail": "admin@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 5,
                "useremail": "admin@email.local"
            },
            {
                "useremailid": 6,
                "useremail": "admin@mymail.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 3,
                    "name": "DATA"
                }
            },
            {
                "role": {
                    "roleid": 1,
                    "name": "ADMIN"
                }
            },
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 7,
        "username": "cinnamon",
        "primaryemail": "cinnamon@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 9,
                "useremail": "favbun@hops.local"
            },
            {
                "useremailid": 10,
                "useremail": "bunny@email.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            },
            {
                "role": {
                    "roleid": 3,
                    "name": "DATA"
                }
            }
        ]
    },
    {
        "userid": 11,
        "username": "barnbarn",
        "primaryemail": "barnbarn@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 12,
                "useremail": "barnbarn@email.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 13,
        "username": "puttat",
        "primaryemail": "puttat@school.lambda",
        "useremails": [],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 14,
        "username": "misskitty",
        "primaryemail": "misskitty@school.lambda",
        "useremails": [
            {
                "useremailid": 15,
                "useremail": "favbun@hops.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    }
]
```

</details>

<details>
<summary>http://localhost:2019/users/user/7</summary>

```JSON
{
    "userid": 7,
    "username": "cinnamon",
    "primaryemail": "cinnamon@lambdaschool.local",
    "useremails": [
        {
            "useremailid": 9,
            "useremail": "favbun@hops.local"
        },
        {
            "useremailid": 10,
            "useremail": "bunny@email.local"
        }
    ],
    "roles": [
        {
            "role": {
                "roleid": 2,
                "name": "USER"
            }
        },
        {
            "role": {
                "roleid": 3,
                "name": "DATA"
            }
        }
    ]
}
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/cinnamon</summary>

```JSON
{
    "userid": 7,
    "username": "cinnamon",
    "primaryemail": "cinnamon@lambdaschool.local",
    "useremails": [
        {
            "useremailid": 9,
            "useremail": "favbun@hops.local"
        },
        {
            "useremailid": 10,
            "useremail": "bunny@email.local"
        }
    ],
    "roles": [
        {
            "role": {
                "roleid": 2,
                "name": "USER"
            }
        },
        {
            "role": {
                "roleid": 3,
                "name": "DATA"
            }
        }
    ]
}
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/like/da</summary>

```JSON
[]
```

</details>

<details>
<summary>POST http://localhost:2019/users/user</summary>

DATA

```JSON
{
    "username": "Mojo",
    "primaryemail": "mojo@lambdaschool.local",
    "password" : "Coffee123",
    "useremails": [
        {
            "useremail": "mojo@mymail.local"
        },
        {
            "useremail": "mojo@email.local"
        }
        ],
    "roles": [
        {
            "role": {
                "roleid": 1
            }
        },
        {
            "role": {
                "roleid": 2
            }
        }
    ]
}
```

OUTPUT

```TEXT
No Body Data

Location Header: http://localhost:2019/users/user/17
Status 201 Created
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/mojo</summary>

</details>

<details>
<summary>PUT http://localhost:2019/users/user/14</summary>

DATA

```JSON
{
    "username": "stumps",
    "primaryemail": "stumps@lambdaschool.local",
    "password" : "EarlGray123",
    "useremails": [
        {
            "useremail": "stumps@mymail.local"
        },
        {
            "useremail": "stumps@email.local"
        }
        ],
    "roles": [
        {  
            "role": {
                "roleid": 3
            }
        },
        {  
            "role": {
                "roleid": 1
            }
        }
    ]
}
```

OUTPUT

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/stumps</summary>

```JSON
{
    "userid": 16,
    "username": "stumps",
    "primaryemail": "stumps@lambdaschool.local",
    "useremails": [
        {
            "useremailid": 19,
            "useremail": "stumps@mymail.local"
        },
        {
            "useremailid": 20,
            "useremail": "stumps@email.local"
        }
    ],
    "roles": [
        {
            "role": {
                "roleid": 1,
                "name": "ADMIN"
            }
        },
        {
            "role": {
                "roleid": 3,
                "name": "DATA"
            }
        }
    ]
}
```

</details>

<details>
<summary>PATCH http://localhost:2019/users/user/7</summary>

DATA

```JSON
{
    "username": "cinabun",
    "primaryemail": "cinabun@lambdaschool.home",
    "useremails": [
    {
            "useremail": "cinnamon@mymail.home"
    },
    {
            "useremail": "hops@mymail.home"
    },
    {
            "useremail": "bunny@email.home"
    }
    ]
}
```

OUTPUT

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>DELETE http://localhost:2019/users/user/14</summary>

```TEXT
No Body Data

Status OK
```

</details>

#!/bin/bash

if [ "$TRAVIS_TOKEN" = "" ]; then
    echo "no TRAVIS_TOKEN defined !";
    exit 1;
fi

body='{
  "request": {
    "branch": "master",
    "message": "make release by api request"
  }
}'

curl -s -X POST \
    -H "Content-Type: application/json" \
    -H "Accept: application/json" \
    -H "Travis-API-Version: 3" \
    -H "Authorization: token $TRAVIS_TOKEN" \
    -d "$body" \
    https://api.travis-ci.org/jboz%2Fliving-documentation/requests

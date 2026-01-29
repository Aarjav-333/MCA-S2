#!/bin/bash

users=$(who | wc -l)
echo "Number of users currently logged in: $users"

# postcode-api

API designed to demonstrate abilities in developing a backend Java Spring service.

# Demo & Snippets

# Requirement/Purpose

- Create an API in Java that allows mobile clients to
  retrieve and add suburb and postcode combinations. You do not have to write the mobile app! - []
- Implement:
  - An API that allows mobile clients to retrieve the suburb information by postcode. - []
  - An API that allows mobile clients to retrieve a postcode given a suburb name - []
- A secured API to add new suburb and postcode combinations (you'll have to work out how this should work) - []
- Some form of persistence (a database) - []
- Testing for controller / service layers - []

# Build Steps

# Design Goals/Approach

- Create a standard restful API.
- For service layer, we will need:
  - a function that allows user to search for suburb/s via postcode.
  - a function that allows user to search for postcode via suburb.
  - A function that allows user to add new suburb and postcode combination.

12/04/2023

- Created methods for the service layer, one for creating the postcode and suburb data, 2 for searching using field names/query and searches data via suburb name/postcode number.
  - Added functions to the repository.

# Features

# Known Issues

# Future Goals

# Change Logs

# What did you struggle with?

# Licencing Details

# Further Details

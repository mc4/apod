# APOD Viewer

This is a small Java app that fetches NASA's Astronomy Picture of the Day (APOD) using their public API. It was built mostly for fun and as a quick project to practice working with REST APIs and Java records.

## What it does

- Connects to NASA's APOD API
- Retrieves photo details for a given date
- Prints out the photo title, explanation, and URL

## Getting Started

Make sure you have Java 17+ and Maven installed.

1. Clone the repo:
git clone https://github.com/mc4/apod.git
cd apod

2. Add your NASA API key:
- Create a `.env` file or update the source to include your API key.
- You can get a free key here: https://api.nasa.gov

3. Run the app:
- mvn clean compile exec:java


## Why I made this

I was curious about the NASA APOD API and thought it’d be a fun way to practice working with external APIs and modern Java features like records.

## License

MIT License. Do whatever you want, just don't sue me.

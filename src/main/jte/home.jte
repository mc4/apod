@import dev.markconley.apod.dto.ApodResponseDto
@param ApodResponseDto apodResponse

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NASA APOD</title>
</head>
<body>
    <h1>Astronomy Picture of the Day</h1>
    
    <div>
        <h2>${apodResponse.title()}</h2>
        <img src="${apodResponse.url()}" alt="Image of the Day" />
    </div>
    
    <form action="/newImage" method="get">
        <button type="submit">Get a new image!</button>
    </form>
</body>
</html>

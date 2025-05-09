@param String imageUrl
@param String title

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${title}</title>
</head>
<body>

    <h1>${title}</h1>

    <img src="${imageUrl}" alt="NASA APOD" style="max-width: 100%; height: auto;">

    <form action="/newImage" method="get">
        <button type="submit">Get a new image!</button>
    </form>

</body>
</html>

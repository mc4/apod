@import dev.markconley.apod.dto.ApodResponseDto
@param ApodResponseDto apodResponse

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NASA APOD</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 min-h-screen flex items-center justify-center p-4">
    <div class="bg-white shadow-lg rounded-lg max-w-2xl w-full p-6 text-center">
        <h1 class="text-3xl font-bold text-blue-700 mb-4">Astronomy Picture of the Day</h1>
        
        <div class="mb-6">
            <h2 class="text-xl font-semibold text-gray-800 mb-2">${apodResponse.title()}</h2>
            <img src="${apodResponse.url()}" alt="Image of the Day" class="mx-auto rounded-lg shadow-md max-h-[500px]" />
        </div>
        
        <form action="/newImage" method="get">
            <button type="submit"
                    class="bg-blue-600 hover:bg-blue-700 text-white font-semibold py-2 px-4 rounded shadow transition duration-300">
                Get a new image!
            </button>
        </form>
    </div>
</body>
</html>

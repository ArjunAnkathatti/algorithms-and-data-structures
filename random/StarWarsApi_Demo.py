#Python 2.7

import reuqests
import json

url = "https://swapi.co/api/films/"

response = requests.get(url)
j = json.loads(response.text)
noOfFilms = j['count']
results = j['results']

print("no of movies = ", noOfFilms)

ft = []
char = 'R'

for res in results:
    if res['title'].find(char) != -1:
        ft.append(res['title'])


print(ft)    


# Python3 code here creating class
class geeks:
    def __init__(self, name, roll):
        self.name = name
        self.roll = roll
 
# creating list
list = []
 
# appending instances to list
list.append(geeks('Akash', 2))
list.append(geeks('Deependra', 40))
list.append(geeks('Reaper', 44))
list.append(geeks('veer', 67))
 
def get_all_geeks_names_in_list(list):
    return [x.name for x in list]

def get_max_roll_in_list(list):
    return max([x.roll for x in list])

def filter_geeks_by_roll(list, roll):
    return [x for x in list if x.roll == roll]

print(filter_geeks_by_roll(list, 40))

print(get_all_geeks_names_in_list(list))

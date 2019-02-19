#include <iostream>
#include <string>
#include <boost/filesystem.hpp>
#include <boost/filesystem/fstream.hpp>

//build: g++ jdk.cpp -o jdk -lboost_system -lboost_filesystem

using namespace std;

int k = 0;

void getAmount(boost::filesystem::path path);

int main (int argc, char *argv[])
{
  string path = argv[1];
  getAmount(path);
  cout << k << endl;
  return 0;
}

void getAmount(boost::filesystem::path path) {
  for(boost::filesystem::directory_entry & entry : boost::filesystem::directory_iterator(path))
  {
    string ext ( ".java" );
    if(is_regular_file(entry.path()))
    {
        if(!ext.compare(boost::filesystem::extension(entry.path())))
          k++;
    } else getAmount(entry.path());
  }
}

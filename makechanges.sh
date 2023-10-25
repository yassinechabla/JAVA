#!/bin/bash

if [ $# -lt 1 ]; then
  echo "Commit message is necessary"
  exit 1
fi

git add ./*
git commit -m "$1"
git push

import { Component, OnInit } from '@angular/core';
import { YoutubeService } from '../../../_04_components-interaction/exercise/prj-training/angular-service-router/src/app/youtube.service';

@Component({
  selector: 'app-youtube-playlist',
  templateUrl: './youtube-playlist.component.html',
  styleUrls: ['./youtube-playlist.component.scss']
})
export class YoutubePlaylistComponent implements OnInit {

  constructor(public youtubeService: YoutubeService) { }

  ngOnInit() {
  }

}
